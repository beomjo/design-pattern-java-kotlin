package k.bs.designpatternsp.pattern.visitor.ja;

public class Client {
    public static void main(String[] args){
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory Lkt = new Directory("Lkt");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");

        root.add(file1);
        bin.add(file2);
        bin.add(file3);
        Lkt.add(file4);
        root.add(Lkt);
        root.add(bin);

        root.accept(new ViewVisitor());    //경로 출력
    }
}
