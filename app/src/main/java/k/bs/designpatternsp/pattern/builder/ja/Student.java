package k.bs.designpatternsp.pattern.builder.ja;

public class Student {

    private String id;
    private String pw;
    private String name;
    private String address;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.pw = builder.pw;
        this.name = builder.name;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static class Builder implements Buildable {
        private final String id;
        private final String pw;
        private String name;
        private String address;
        private String phoneNumber;

        @Override
        public Student build() {
            return new Student(this);
        }

        public Builder(String id, String pw) {
            this.id = id;
            this.pw = pw;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
