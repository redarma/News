package org.rest.news;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/news")
public class NewsResource {
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<News> findAll() {
        NewsDAO dao = NewsDAO.getInstance();
        return dao.findNews("findAll");
    }
    @GET
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public List<News> findNewest() {
        NewsDAO dao = NewsDAO.getInstance();
        return dao.findNews("findNewest");
    }
    @GET
    @Path("{NewsID}")
    @Produces(MediaType.APPLICATION_JSON)
    public News findById(@PathParam("NewsID") String NewsID) {
        NewsDAO dao = NewsDAO.getInstance();
        return dao.findById(Integer.parseInt(NewsID)).get(0);
    }
    @DELETE
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteAll() {
        NewsDAO dao = NewsDAO.getInstance();
        dao.deleteNews("deleteAll");
    }
    @DELETE
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteNewest() {
        NewsDAO dao = NewsDAO.getInstance();
        dao.deleteNews("deleteNewest");
    }
    @DELETE
    @Path("{NewsID}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("NewsID") String NewsID) {
        NewsDAO dao = NewsDAO.getInstance();
        dao.deleteById(Integer.parseInt(NewsID));
    }
}
