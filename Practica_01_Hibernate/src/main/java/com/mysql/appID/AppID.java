package com.mysql.appID;

import com.mysql.gestorpersistencia.GestorPersistencia;

public class AppID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorPersistencia gp = new GestorPersistencia();
		System.out.println(gp.getID(2));
		gp.cerrar();

	}

}
