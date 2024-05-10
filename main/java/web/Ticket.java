package web;

import java.io.IOException;
import java.sql.Date;

import dao.Implementation;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Ticketvol;

public class Ticket extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Ticket() {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/forml.java")) {
            try {
                // Récupération des paramètres de requête
                int idd = Integer.parseInt(request.getParameter("vol"));
                String depart = request.getParameter("ville_depart");
                Date Date_depart = Date.valueOf(request.getParameter("Date_depart"));
                String arrive = request.getParameter("distination");
                int passager = Integer.parseInt(request.getParameter("nombre_passager"));
                Double prix = Double.parseDouble(request.getParameter("prix")); // Utilisez le paramètre "prix"

                // Créez un objet Ticketvol avec les informations récupérées
                Ticketvol ticket = new Ticketvol(depart, Date_depart, arrive, passager, prix);

                // Appelez la méthode Ajouter de l'implémentation
                Implementation imp = new Implementation();
                imp.ajouterTicketVol(ticket);

                // Redirigez vers la page d'accueil
                response.sendRedirect(request.getContextPath()+"/index.jsp");
            } catch (NumberFormatException e) {
                e.printStackTrace(); // Gérez l'exception ici (affichage ou autre action)
            }
        }
    }
}
