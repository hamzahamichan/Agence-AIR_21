package metier;

import java.sql.Date;

public class Ticketvol {
		private int vol_id;
		private String ville_depart;
		private Date Date_depart;
		private String distination;
		private int nombre_passager;
		private double prix;
		
		public int getVol_id() {
			return vol_id;
		}
		public void setVol_id(int vol_id) {
			this.vol_id = vol_id;
		}
		public String getVille_depart() {
			return ville_depart;
		}
		public void setVille_depart(String ville_depart) {
			this.ville_depart = ville_depart;
		}
		public Date getDate_depart() {
			return Date_depart;
		}
		public void setDate_depart(Date date_depart) {
			Date_depart = date_depart;
		}
		public String getDistination() {
			return distination;
		}
		public void setDistination(String distination) {
			this.distination = distination;
		}
		public int getNombre_passager() {
			return nombre_passager;
		}
		public void setNombre_passager(int nombre_passager) {
			this.nombre_passager = nombre_passager;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		public Ticketvol(String ville_depart, Date date_depart, String distination, int nombre_passager,
				double prix) {			
			this.ville_depart = ville_depart;
			Date_depart = date_depart;
			this.distination = distination;
			this.nombre_passager = nombre_passager;
			this.prix = prix;
		}
		
		
	}


