package abstraction;

abstract class Proofs{
    abstract void aadharcard();
    public void pancard(){
        System.out.println("Pan card");
    }
}
class Rahul extends Proofs
{
    void aadharcard(){
        System.out.println("Aadhar card");
    }
}
class Prgm1{
    public static void main(String args[]){
        Rahul rahul=new Rahul();
        rahul.aadharcard();
        rahul.pancard();
}
}