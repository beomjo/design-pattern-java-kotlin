package k.bs.designpatternsp.behavioral.visitor.ja;

public class ViewVisitor extends Visitor {
    private String path = "";

    public void visit(File file) {
        System.out.println(path + "/" + file.name);
    }

    public void visit(Directory dic) {
        path = path + "/" + dic.name;
        System.out.println(path);
        for (int i = 0; i < dic.directory.size(); i++) {
            dic.directory.get(i).accept(this);
        }
    }
}