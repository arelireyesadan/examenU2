package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Clientes;
import com.example.demo.model.Computadoras;
import com.example.demo.model.Proveedores;
import com.example.demo.model.Tickets;
import com.example.demo.model.Venta;
@Controller
@RequestMapping("/examenUnidad2")
public class Controlador {
	@GetMapping("/")
	public String index(Model modelo) {
		
		return "index";
	}
	@GetMapping("/Computadoras")
	public String Computadoras(Model modelo) {
		List<Computadoras> computadoras = new ArrayList<Computadoras>();
		computadoras.add(new Computadoras("145100","Lenovo","Core i5","Windows 10 Pro","8Gb","6"));
		computadoras.add(new Computadoras("145101","HP","Core i5","Windows 10 Home","6Gb","4"));
		computadoras.add(new Computadoras("145102","MacBook Air","Intel core i5","MacOS High Sierra","128b","12"));
		computadoras.add(new Computadoras("145103","Asus X540NA-GQ005T","Celeron","Windows 8","4Gb","4"));
		computadoras.add(new Computadoras("145104","HP 15-cw1012","AMD R3","Windows 8","12Gb","4"));
		computadoras.add(new Computadoras("145105","Lenovo Ideapad L340-15API","Ryzen 3","Windows 10 Home","4Gb","12"));
		computadoras.add(new Computadoras("145106","Notebook Huawei Matebook D14","Ryzen 5","Windows 10 Pro","8Gb","6"));
		computadoras.add(new Computadoras("145107","Dell G3590WI7811281660W1","Intel Core i7","Windows 10 Pro","16Gb","12"));
		computadoras.add(new Computadoras("145108","Dell","Intel CORE i9","Windows 10 Pro","16Gb","8"));
		computadoras.add(new Computadoras("145109","Asus","Intel CORE i5","Windows 8","12Gb","4"));
		modelo.addAttribute("computadoras",computadoras);
		return "Computadoras";
	}
		
	@GetMapping("/Tickets")
	public String Tickets(Model modelo) {
		List<Tickets> tickets = new ArrayList<Tickets>();
		tickets.add(new Tickets("1","22","145101","1","7000"));
		tickets.add(new Tickets("2","23","145108","2","15000"));
		tickets.add(new Tickets("3","24","145103","1","9800"));
		tickets.add(new Tickets("4","25","145102","2","21000"));
		tickets.add(new Tickets("5","26","14510","1","8500"));
		tickets.add(new Tickets("6","27","145106","2","7000"));
		tickets.add(new Tickets("7","28","145107","3","15000"));
		tickets.add(new Tickets("8","29","145100","4","3000"));
		tickets.add(new Tickets("9","30","145104","5","2700"));
		tickets.add(new Tickets("10","31","145105","4","5000"));
		modelo.addAttribute("tickets",tickets);
		return "Tickets";
	}
		
	@GetMapping("/Venta")
	public String Venta(Model modelo) {
		List<Venta> venta = new ArrayList<Venta>();
		venta.add(new Venta("22","567","11/11/20","7000","0.16","100","$8220"));
		venta.add(new Venta("23","570","10/11/20","30000","0.16","200","$35000"));
		venta.add(new Venta("24","574","11/10/20","9800","0.16","300","$11668"));
		venta.add(new Venta("25","568","09/10/20","42000","0.16","800","$49520"));
		venta.add(new Venta("26","571","10/09/20","8500","0.16","200","$10060"));
		venta.add(new Venta("27","576","11/11/20","14000","0.16","100","$16440"));
		venta.add(new Venta("28","572","10/10/20","45000","0.16","300","$52500"));
		venta.add(new Venta("29","573","11/05/20","12000","0.16","300","$14020"));
		venta.add(new Venta("30","569","09/04/20","13500","0.16","240","$15900"));
		venta.add(new Venta("31","575","10/08/20","20000","0.16","500","$23700"));
		modelo.addAttribute("venta",venta);
		return "Venta";
	}		
		
	@GetMapping("/Clientes")
	public String Clientes(Model modelo) {
		List<Clientes> clientes = new ArrayList<Clientes>();
		clientes.add(new Clientes("567","Areli","Reyes","5576352810","areli@gmail.com","Gamadero"));
		clientes.add(new Clientes("568","Juan","Sanchez","5598362075","juan@gmail.com","Ecatepec"));
		clientes.add(new Clientes("569","Juana","Posadas","3328493328","juana@gmail.com","San juan"));
		clientes.add(new Clientes("570","Valeria","Perez","5501253855","valeria@gmail.com","Impulsora"));
		clientes.add(new Clientes("571","Ernesto","Gutierrez","5569574634","ernesto@gmail.com","Olimpica"));
		clientes.add(new Clientes("572","Araceli","Gonzalez","550538411","araceli@gmail.com","Gamadero"));
		clientes.add(new Clientes("573","Alfredo","Perez","5564839200","alfredo@gmail.com","Ecatepec"));
		clientes.add(new Clientes("574","Damaris","Gallardo","3384665836","damaris@gmail.com","San juan"));
		clientes.add(new Clientes("575","Ana","Jimenez","5512345687","ana@gmail.com","Impulsora"));
		clientes.add(new Clientes("576","Francisca","Fernandez","3392837465","francisca@gmail.com","Olimpica"));
		modelo.addAttribute("clientes",clientes);
		return "Clientes";
	}
		
	@GetMapping("/Proveedores")
	public String Proveedores(Model modelo) {
		List<Proveedores> proveedores = new ArrayList<Proveedores>();
		proveedores.add(new Proveedores("821123","Apple","Ulises","ulises@gmail.com","CUPU800825569","5573948274","Ecatepec"));
		proveedores.add(new Proveedores("123654","HP","Luisa","luisa@gmail.com","AAL741030G97","5510574637","Impulsora"));
		proveedores.add(new Proveedores("159951","Lenovo","Franco","franco@gmail.com","ATF920325PX3","5538465769","Neza"));
		proveedores.add(new Proveedores("456987","Dell","Omar","omar@gmail.com","TGO020409V45","5596079868","Villa de Aragón"));
		proveedores.add(new Proveedores("987654","Asus","Salma","salma@gmail.com","ECO000224FZ2","5514235461","Toluca"));
		proveedores.add(new Proveedores("821123","Huawei","Berenice","bere@gmail.com","TVA051110NC8","5537253645","Ecatepec"));
		proveedores.add(new Proveedores("123654","Apple","Uzziel","uzzi@gmail.com","GEI970411DV7","5574867546","Toluca"));
		proveedores.add(new Proveedores("159951","HP","David","david@gmail.com","DIN050426M70","5583019283","Olímpica"));
		proveedores.add(new Proveedores("456987","Asus","Guillermo","guillermo@gmail.com","CTR951130I62","5584039172","Villa de Aragón"));
		proveedores.add(new Proveedores("987654","HP","Maricela","mari@gmail.com","DCE970806AY3","55193820485","Plaza Aragón"));
		modelo.addAttribute("proveedores",proveedores);
		return "Proveedores";
	}
}
