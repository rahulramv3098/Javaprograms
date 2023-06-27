package Programs.polymorphism;

class Skcet{
    public void total() {
        System.out.println("1800");
    }
}

class CSE extends Skcet{
    public void total() {
        System.out.println("350");
    }
}

class IT extends Skcet {
    public void total() {
        System.out.println("512");
    }
}

class program2 {
    public static void main(String[] args) {
        Skcet skcet = new Skcet();
        Skcet cse = new CSE();
        Skcet it = new IT();
        skcet.total();
        cse.total();
        it.total();
}
}
