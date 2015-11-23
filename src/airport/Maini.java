package airport;
import peple.Peple;
public class Maini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peple Pep=new Peple();
		Pep.name="Mihail";
		Pep.number_pasport=123456;
		Pep.num=537;
		Pep.col_buy=1;
		
		Airport Air=new Airport();
		Airport.Ticket Tick=Air.new Ticket();
		Airport.Ticket.Reis Rei=Tick.new Reis();
		Airport.Ticket.Reis.Plant Plan=Rei.new Plant();
		
		Air.col_buy_ticket=52;
		Air.col_plan=12;
		Air.name="Socol";
		Air.send_col_plan=5;
		
		Tick.zapoln(Pep);
		Tick.time_v="15.20";
		Tick.time_p="17:30";
		Rei.col_ticket=15;
		Rei.name_rais="Paris";
		Rei.number_rais=1289;
		Rei.price=15000;
		
		Plan.name_plant="Airflot";
		Plan.col_mest=380;
		Plan.col_zan_mest=15;
		
		Air.eya_air();
		Rei.eya();
		Plan.info();
		
		Plan.mesto(Pep.col_buy);
		Air.max_col_buy_ticket(Pep.col_buy);
		Rei.max_col_ticket(Pep.col_buy);
		
		Pep.info();
		Air.eya_air();
		Tick.eya_tiket();
		Rei.eya();
		Plan.info();
		
	}

}





	
		
		

		
		
		
