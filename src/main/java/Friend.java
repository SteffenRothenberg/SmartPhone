public class Friend extends Contact{
    public String telephoneNumber;

    public Friend() {
    }

    public Friend(String telephoneNumber, String nameOfContact) {
        this.telephoneNumber = telephoneNumber;
        super.nameOfContact = nameOfContact;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend friend)) return false;
        if (!super.equals(o)) return false;

        return getTelephoneNumber() == friend.getTelephoneNumber();
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telephoneNumber='" + telephoneNumber + '\'' +
                ", nameOfContact='" + nameOfContact + '\'' +
                '}';
    }

}
