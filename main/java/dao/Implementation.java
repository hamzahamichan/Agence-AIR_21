package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import metier.Ticketvol;

public class Implementation {
    public void ajouterTicketVol(Ticketvol ticket) {
        Connection cn = dbconnection.getConnection();
      
        try {
            String query = "INSERT INTO vol (ville_depart, Date_depart, distination, nombre_passager, prix) VALUES (?,?,?,?,?);";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, ticket.getVille_depart());
            ps.setDate(2, ticket.getDate_depart());
            ps.setString(3, ticket.getDistination());
            ps.setInt(4, ticket.getNombre_passager());
            ps.setDouble(5, ticket.getPrix());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérez l'exception de manière appropriée (par exemple, en la journalisant ou en affichant un message d'erreur)
        }
    }
}
