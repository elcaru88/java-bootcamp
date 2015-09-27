package model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Fechas {

	Calendar unaFecha;
	Random aleatorio;

	public Fechas() {
		int numero = 0;

		aleatorio = new Random();

	}

	public String getFecha() {
		unaFecha = Calendar.getInstance();
		unaFecha.set(aleatorio.nextInt(10) + 1987, aleatorio.nextInt(12) + 1,
				aleatorio.nextInt(30) + 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		return sdf.format(unaFecha.getTime());

	}

	public static void main(String[] args) {

		Fechas f = new Fechas();
		String[] name = { "PARIL", "RUTH", "HELEN", "WALTER", "DELIA", "ANNIE",
				"KARN", "OLAF", "DAGNY", "CLIFFORD", "LILLIAN", "HAROLD",
				"HENRY", "MABEL", "VICTOR", "MYRTLE MATTISON", "GEORGE",
				"ARTHUR", "ARVID", "EUGENE", "HILBERT", "ARNOLD", "CLARENCE",
				"MANDA", "EBBA", "MONHRAD", "OLAF", "MABEL", "ANNIE",
				"ALFREDA", "MYRTLE", "AGNES", "MYHRE", "BENJI", "MARION",
				"CLARA", "MARTIN", "ALLIE", "VICTOR", "JORGEN", "MABEL",
				"CLARENCE", "SELMER", "ANNA", "RALPH", "MELVIN", "ADELBERT",
				"INGA", "MORA", "CLARA", "ARHTUR", "NELLIE", "CLARA", "CLARA",
				"AUTHUR", "IZETTA", "SELMA", "THEODORE", "JOHN", "CLARA",
				"DELLA", "CLARA", "NORMAN", "NELMAR", "HEROLD", "CECIL",
				"ELLA", "CHRISTIAN", "EMMA", "CARL", "ALBIN", "ASTRA",
				"HARTVIG", "WILLIAM", "ELVA", "VENDELL", "SELMA", "VICTOR",
				"CLARENCE", "HILDA", "STANLEY", "GLADYS", "ROSE", "MINNIE",
				"ALBERT", "CHAS", "CECIL", "CELIA", "EMIL", "JOSEPH", "DENA",
				"ANNA", "ALDEBERT", "OTTI", "TILLA", "CHAS", "FRANK", "Alice",
				"Ryan", "Luca" };

		String[] lastName = { "ABREHAMSON", "ALTMAN", "ANDERSON", "ARP",
				"BENEDICT", "BOOTH", "BORGEN", "BRATZ", "BREDESON", "BUTH",
				"CARLSON", "CHRISTIANSAN", "CLARK", "DOUGHERTY", "EDWARDS",
				"FENGDAHL", "FOLDEN", "GAARE", "GROVER", "HALL", "HALLAND",
				"HANSON", "HELSETH", "HOLM", "HOVLAND", "IZUILE", "JARE",
				"JOHNSON", "KNUTH", "KOFLAR", "KUEHL", "LAMMERS", "LEACH",
				"LEE", "LEGGER", "LEITZ", "LOE", "LOKKEN", "LORENZEN", "LUTHE",
				"MAYFIELD", "MCGAUGH", "MCNAIR", "MERROTT", "MILLER", "MOE",
				"MURPHY", "NELSON", "NERGAARD", "NORDQUEST", "NYENG", "OLIVER",
				"OLSEN", "PAASCH", "PEPPER", "PETERSON", "POEHLS", "ROBINSON",
				"ROMKEY", "RUGG", "SALOMONSON", "SANDERN", "SAUDER", "SCHEEL",
				"SCHMILEY", "SCHROEDER", "SEVENSON", "SILL", "SKAUFORD",
				"SKREI", "SKULLERUDE", "SNARTLAUD", "SOLUM", "STENSGAARD",
				"TAINTER", "TANGER", "THOMPSON", "THORTVEDT", "THUN",
				"THYSELL", "TRIGGS", "TUCKER", "TVETIN", "WALLINGER",
				"WALSTROM", "WHALEY", "WYATT", "BREMER", "CHEN", "CICCU",
				"CALAFATO", "GRISSO", "DELAMORE", "MELLO", "LUGO", "MARTIN",
				"ROTHENBERG", "ANDERSGARD", "BACKMAN", "BELL", };
	
		String[] arr = new String[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "insert into high_school.student values ('"+
		name[i]+"','"+lastName[i]+"','"+f.getFecha()+"');";
//insert into high_school.student values ('Ted','Bremer','');			
		}
		System.out.println(Arrays.toString(arr));

	}
}
