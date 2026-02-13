package Homework2.task1;

public class User {
        private final int id;
        private final String name;
        private final String username;
        private String email;
        private Address address;
        private String phone;
        private String website;
        private Company company;


        public User(int id, String name, String username, String email,
                    String street, String suite, String city, String zipcode, String lat, String lng,
                    String phone, String website,
                    String companyName, String catchPhrase, String bs) {
            this.id = id;
            this.name = name;
            this.username = username;
            this.email = email;
            this.phone = phone;
            this.website = website;

            Geolocation geolocation = new Geolocation(lat, lng);
            this.address = new Address(street, suite, city, zipcode, geolocation);
            this.company = new Company(companyName, catchPhrase, bs);
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", address=" + address +
                    ", phone='" + phone + '\'' +
                    ", website='" + website + '\'' +
                    ", company=" + company +
                    '}';
        }
    }
