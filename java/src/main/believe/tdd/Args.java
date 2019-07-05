package bobdeng.tdd;

public class Args {

    private final Schemas schemas;
    private final Command command;

    public Args(String schema, String command) {
        this.schemas = new Schemas(schema);
        this.command = new Command(command);
    }

    public Object getValue(String name) {
        return schemas.getValue(name,command.getValue(name));
    }
}
