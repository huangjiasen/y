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
			   return "您请输入至少有一个不是数字，请正确输入";
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
			   return "您请输入至少有一个不是数字，请正确输入";
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
			   return "您请输入至少有一个不是数字，请正确输入";
		   }
		   return Float.parseFloat(num[0])+"*"+Float.parseFloat(num[1])+"="+sum;
		}

		public String Division(String msg){
		   String[] num = msg.split(":");
		   float sum = 0;
		   try 
		   { 
			   if(Float.parseFloat(num[1]) == 0){
				   return "由于您选择的是除法运算，所以除数不能为零";
			   }
			    sum  =   Float.parseFloat(num[0]) / Float.parseFloat(num[1]); 
		   } 
		   catch(NumberFormatException   e) 
		   { 
			   return "您请输入至少有一个不是数字，请正确输入";
		   }
		   return Float.parseFloat(num[0])+"/"+Float.parseFloat(num[1])+"="+sum;
		}
}
