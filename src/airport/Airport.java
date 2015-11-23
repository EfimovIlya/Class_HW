package airport;
import peple.Peple;

public class Airport {
	
	public String name;
	public int col_plan;
	public int send_col_plan;
	public int col_buy_ticket;
	
		public class Ticket{
			public String name_pas;
			public String time_v;
			public String time_p;
			public int pasport;
			public int num;
			
			public class Reis {
		
				public String name_rais;
				public int number_rais;
				public int col_ticket;
				public int price;
		
				public void eya(){System.out.println("Рейс:"+name_rais+" "+"Номеррейса "+number_rais+" Билетов осталось"+col_ticket+" Цена за один билет="+price );}
				public void min_col_ticket(int ticket){col_ticket=col_ticket+ticket;}
				public void max_col_ticket(int ticket){col_ticket=col_ticket-ticket;}
		
		
					public class Plant{
						public String name_plant;
						public int col_mest;
						public int col_zan_mest;
						
						public void info(){int mest=col_mest-col_zan_mest;
							System.out.println("Самолет  "+name_plant+" количество свободных мест "+mest); }
						public void mesto(int mesto){col_zan_mest=col_zan_mest+mesto;}
					}
			}	
		
			public void eya_tiket(){
				System.out.println(name_pas+" Время вылета"+time_v+" Время прилета"+time_p+" Паспорт №"+pasport+" "+"Номер билет="+num );
			}
		public void zapoln(Peple p){
			name_pas=p.name;
			pasport=p.number_pasport;
			num=p.num;
		}	
		}
		public void eya_air(){System.out.println("Аэропорт:"+name+" "+"Количество самолетов "+col_plan+" Врейсе находиться"+send_col_plan+" самолетов. Количество проданных билетов="+col_buy_ticket );}
		public void max_col_buy_ticket(int ticket){col_buy_ticket=col_buy_ticket+ticket;}
		public void min_col_buy_ticket(int ticket){col_buy_ticket=col_buy_ticket-ticket;}
}
