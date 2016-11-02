package com.sve.calculator.war.arithmetic;

public class arithmetic {
	public String Addition(String msg){
		   String[] num = msg.split(":");
		   float sum = 0;
		   try 
		   { 
			    sum  =   Float.parseFloat(num[0]) + Float.parseFloat(num[1]); 
		   } 
		   catch(NumberFormatException   e) 
		   { 
			   return "��������������һ���������֣�����ȷ����";
		   }
		   return Float.parseFloat(num[0])+"+"+Float.parseFloat(num[1])+"="+sum;
		}


		public String Subtraction(String msg){
		   String[] num = msg.split(":");
		   float sum = 0;
		   try 
		   { 
			    sum  =   Float.parseFloat(num[0]) - Float.parseFloat(num[1]); 
		   } 
		   catch(NumberFormatException   e) 
		   { 
			   return "��������������һ���������֣�����ȷ����";
		   }
		   return Float.parseFloat(num[0])+"-"+Float.parseFloat(num[1])+"="+sum;
		}

		public String Multiplication(String msg){
		   String[] num = msg.split(":");
		   float sum = 0;
		   try 
		   { 
			    sum  =   Float.parseFloat(num[0]) * Float.parseFloat(num[1]); 
		   } 
		   catch(NumberFormatException   e) 
		   { 
			   return "��������������һ���������֣�����ȷ����";
		   }
		   return Float.parseFloat(num[0])+"*"+Float.parseFloat(num[1])+"="+sum;
		}

		public String Division(String msg){
		   String[] num = msg.split(":");
		   float sum = 0;
		   try 
		   { 
			   if(Float.parseFloat(num[1]) == 0){
				   return "������ѡ����ǳ������㣬���Գ�������Ϊ��";
			   }
			    sum  =   Float.parseFloat(num[0]) / Float.parseFloat(num[1]); 
		   } 
		   catch(NumberFormatException   e) 
		   { 
			   return "��������������һ���������֣�����ȷ����";
		   }
		   return Float.parseFloat(num[0])+"/"+Float.parseFloat(num[1])+"="+sum;
		}
}
