package Programs.polymorphism;

class Training{  
void code(){System.out.println("Training");}  
}  
class t1 extends Training{  
void code(){System.out.println("T1 training...");}  
}  
class t2 extends Training{  
void code(){System.out.println("T2 training...");}  
}  
class Bootcamp extends Training{  
void code(){System.out.println("Bootcamp training...");}  
}  
class program3{  
public static void main(String args[]){  
Training t;  
t=new t1();  
t.code();  
t=new t2();  
t.code(); 
t=new Bootcamp();
t.code(); 
}
}
