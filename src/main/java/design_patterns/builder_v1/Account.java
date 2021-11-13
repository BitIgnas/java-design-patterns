package design_patterns.builder_v1;

public class Account {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer number;

    public Account(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.number = builder.number;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number=" + number +
                '}';
    }

    public static class Builder {
        private Long id;
        private String firstname;
        private String lastname;
        private Integer number;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder withNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Account build() {
            return new Account(this);
        }


    }
}
