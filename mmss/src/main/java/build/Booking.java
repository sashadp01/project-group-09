/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.sql.Date;

// line 77 "mmss.ump"
// line 141 "mmss.ump"
public abstract class Booking
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Booking Attributes
  private Date date;
  private int price;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Booking(Date aDate, int aPrice)
  {
    date = aDate;
    price = aPrice;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(Date aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrice(int aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public Date getDate()
  {
    return date;
  }

  public int getPrice()
  {
    return price;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "price" + ":" + getPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}