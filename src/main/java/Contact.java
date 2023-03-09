public abstract class Contact {

   public String nameOfContact;

   public Contact() {
   }

   public Contact(String nameOfContact) {
      this.nameOfContact = nameOfContact;
   }

   public String getNameOfContact() {
      return nameOfContact;
   }

   public void setNameOfContact(String nameOfContact) {
      this.nameOfContact = nameOfContact;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Contact contact)) return false;

      return getNameOfContact().equals(contact.getNameOfContact());
   }

   @Override
   public int hashCode() {
      return getNameOfContact().hashCode();
   }

}
