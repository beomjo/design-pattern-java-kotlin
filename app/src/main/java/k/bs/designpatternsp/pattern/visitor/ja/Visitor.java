package k.bs.designpatternsp.pattern.visitor.ja;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}