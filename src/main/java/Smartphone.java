import java.util.List;

public class Smartphone implements Radio,GPS{

    String model;
    String manufacturer;
    List <Contact> contactList;
    boolean radioStatus;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, List<Contact> contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
        this.radioStatus = false;
    }
    public String getPosition() {
        return "Cologne";
    }
    public boolean startRadio() {
        if (radioStatus == true){
            System.out.println("Radio is already on");
            return true;
        }
        System.out.println("Radio started");
        this.radioStatus = true;
        return true;
    }
    public boolean stopRadio() {
        if (radioStatus == false){
            System.out.println("Radio is already off");
            return false;
        }
        System.out.println("Radio stopped");
        this.radioStatus = false;
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List getContactList() {
        return contactList;
    }

    public void setContactList(List contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;

        if (!getModel().equals(that.getModel())) return false;
        if (!getManufacturer().equals(that.getManufacturer())) return false;
        return getContactList().equals(that.getContactList());
    }

    @Override
    public int hashCode() {
        int result = getModel().hashCode();
        result = 31 * result + getManufacturer().hashCode();
        result = 31 * result + getContactList().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
