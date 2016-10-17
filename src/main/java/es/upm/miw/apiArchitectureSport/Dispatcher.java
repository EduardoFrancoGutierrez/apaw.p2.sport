package es.upm.miw.apiArchitectureSport;

import es.upm.miw.apiArchitectureSport.api.SportResource;
import es.upm.miw.apiArchitectureSport.api.UserResource;
import es.upm.miw.apiArchitectureSport.api.UserSportResource;
import es.upm.miw.apiArchitectureSport.expetions.InvalidNickException;
import es.upm.miw.apiArchitectureSport.expetions.InvalidSportException;
import es.upm.miw.apiArchitectureSport.expetions.NotFoundSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidRequestException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidThemeFieldException;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Dispatcher {
    private UserResource userResource = new UserResource();

    private UserSportResource userSportResource = new UserSportResource();

    private SportResource SportResource = new SportResource();

    private void responseError(HttpResponse response, Exception e) {
        response.setBody("{\"error\":\"" + e + "\"}");
        response.setStatus(HttpStatus.BAD_REQUEST);
    }

    public void doGet(HttpRequest request, HttpResponse response) {
        // **/users
        if (request.paths().length > 1 && "users".equals(request.paths()[0]) && request.paths()[1].contains("search?sport=")) {

            String sport = request.paths()[1].split("=")[1];
            try {
                response.setBody(this.userSportResource.nickUsersBySport(sport));
            } catch (InvalidThemeFieldException e) {
                responseError(response, e);
            }
        } else if ("users".equals(request.paths()[0])) {
            try {
                response.setBody(this.userResource.allUsers());
            } catch (InvalidThemeFieldException e) {
                responseError(response, e);
            }
        } else
            responseError(response, new InvalidRequestException(request.getPath()));
    }

    public void doPost(HttpRequest request, HttpResponse response) {
        switch (request.getPath()) {
        case "users":
            String nick = request.getBody().split(":")[0];
            String email = request.getBody().split(":")[1];
            try {
                response.setBody(this.userResource.createUser(nick, email));
            } catch (InvalidNickException e) {
                responseError(response, e);
            }
            break;
        case "sports":
            try {
                response.setBody(this.SportResource.createSport(request.getBody()));
            } catch (InvalidSportException e) {
                responseError(response, e);
            }
            break;
        default:
            responseError(response, new InvalidRequestException(request.getPath()));
            break;
        }

    }

    public void doPut(HttpRequest request, HttpResponse response) {
        if ("users".equals(request.paths()[0]) && "sport".equals(request.paths()[2])) {
            String nick = request.paths()[1];
            try {
                response.setBody(this.userSportResource.addSportInUser(nick, request.getBody()));
            } catch (NotFoundSportException e) {
                responseError(response, e);
            }
        }

        else
            responseError(response, new InvalidRequestException(request.getPath()));

    }

    public void doDelete(HttpRequest request, HttpResponse response) {
        switch (request.getPath()) {
        default:
            responseError(response, new InvalidRequestException(request.getPath()));
            break;
        }
    }
}
