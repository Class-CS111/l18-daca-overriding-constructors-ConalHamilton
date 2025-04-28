/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * @author Conal Hamilton
 *
 * @version 1.2
 **/
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ DACArecipient()
+ DACArecipient(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFromDate : int, expirationDate : int, sex : char)
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{
  /****** CONSTANTS ******/
  private static final String ASCII_ART_0 ="    .----.    .----.  ",
        ASCII_ART_1 = "   (  --  \\  /  --  )",
        ASCII_ART_2 = "          |  |        ",
        ASCII_ART_3 = "         _/  \\_      ",
        ASCII_ART_4 = "        (_    _)      ",
        ASCII_ART_5 = "     ,    `--`    ,   ",
        ASCII_ART_6 = "     \\'-.______.-'/  ",
        ASCII_ART_7 = "      \\          /   ",
        ASCII_ART_8 = "       '.--..--.'     ",
        ASCII_ART_9 = "         `\"\"\"\"\"` ",
        ASCII_CREDIT ="   ascii art by: jgs    ";
	private static final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
	private static final String LABEL_SURNAME = "Surname", 
				LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
				LABEL_BIRTH_COUNTRY = "Country of Birth",
				LABEL_BIRTH_DATE = "Date of Birth",
				LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	/***** ACCESSORS *****/
	/**
	 * Returns surname of DACArecipient object
	 * 
	 * @return String with surname
	 */
	public String getSurname()
	{
		return this.surname;
	}
	/**
	 * Returns the given name of DACArecipient object
	 * 
	 * @return String with given name
	 */
	public String getGivenName()
	{
		return this.givenName;
	}
	/**
	 * Returns the USCIS number of the DACArecipient object
	 * 
	 * @return String with USCIS number
	 */
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	/**
	 * Retuns the country of origin of the DACArecipient object
	 * 
	 * @return String with country of origin
	 */
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;
	}
	/**
	 * Returns the birthday of the DACArecipient object
	 * 
	 * @return int with birthday as a Julian Day Number
	 */
	public int getBirthday()
	{
		return this.birthday;
	}
	/**
	 * Returns the valid from date of the DACArecipient object
	 * 
	 * @return int with valid from date as a Julian Day Number
	 */
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	/**
	 * Returns the expiration date of the DACArecipient object
	 * 
	 * @return int with expiration date as a Julian Day Number
	 */
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	/**
	 * Returns the sex of the DACArecipient object
	 * 
	 * @return char representing sex
	 */
	public char getSex()
	{
		return this.sex;
	}

	/***** MUTATORS *****/
	/**
	 * Sets surname to given parameter value
	 * 
	 * @param surname String containing last name
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	/**
	 * Sets givenName to given parameter value
	 * 
	 * @param givenName String containing given name
	 */
	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
	/**
	 * Sets uscisNumber to given parameter value
	 * 
	 * @param uscisNumber String containing USCIS number
	 */
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	/**
	 * Sets countryOfOrigin to given parameter value
	 * 
	 * @param countryOfOrigin String containing country of origin
	 */
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 * Sets birthday to given parameter value
	 * 
	 * @param birthday int of birthdate as Julian Day Number
	 */
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	/**
	 * Sets validFromDate to given parameter value
	 * 
	 * @param validFromDate int of valid from date as Julian Day Number
	 */
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	/**
	 * Sets expirationDate to given parameter value
	 * 
	 * @param expirationDate int of expiration date as Julian Day Number
	 */
	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	/**
	 * Sets sex to given parameter value
	 * 
	 * @param sex char representing sex
	 */
	public void setSex(char sex)
	{
		this.sex = sex;
	}
    
  /**
   * Assigns parameters to corresponding instance variables of calling DACArecipient. 
   * 
   */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
	/**** CONSTRUCTORS ****/
  //TODO: Write the no-argument constructor and full constructor. Remember to include documentation for each method.

  /**
   * Default no-argument constructor, sets all instance variables to default values without any parameters
   */
  public DACArecipient()
  {
    setAll("Unknown", "Unknown", "Unknown", "Unknown", 2415021, 2415021, 2415021, 'X');
  }
  /**
   * Full constructor, takes parameters for each instance variable.
   * @
   */
  public DACArecipient(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
  {
    setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
  }

	/***** OTHER REQUIRED METHODS *****/
  /**
   * Returns a string will all of the instance variables of the object
   * 
   * @return String with each instance variable preceded by its variable name in plain english and a colon (eg "Surname: Doe")
   */
	public String toString()
	{
		return String.format("Surname: %s Given Name: %s USCIS Number: %s Country of Origin: %s Birthday: %d Valid From: %d Expires: %d Sex: %c", surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
	}
    /**
   * Compares the instance variables of the calling DACArecipient object with those of the object given as a parameter.  If all are equal the boolean will be true, else false.
   * 
   *  @param DACArecipient object to be compared with the calling object
   * 
   * @return Boolean representing whether or not the parameter object and calling object share the same variable values.  One or more variable mismatch returns False.
   */
	public boolean equals(DACArecipient other)
	{
		return this.surname.equals(other.surname) &&
			this.givenName.equals(other.givenName) &&
			this.uscisNumber.equals(other.uscisNumber) &&
			this.countryOfOrigin.equals(other.countryOfOrigin) &&
			this.birthday == other.birthday &&
			this.validFromDate == other.validFromDate &&
			this.expirationDate == other.expirationDate &&
			this.sex == other.sex;
	}
    /** DESCRIPTION: Prints to the console the Employment Authorization Card using the calling DACArecipient's instance variables.*/
    public String printCard()
    {
      String card;
      
      card = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
      card += String.format("║%35s%35s║%n", TITLE_USA, "");
      card += String.format("║%60s%10s║%n", TITLE_EAC, "");
      card += String.format("║%-25s%-45S║%n", "", LABEL_SURNAME);
      card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
      card += String.format("║%-25s%-45S║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
      card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);
      
      card += String.format("║%-25s%-45S║%n", ASCII_ART_3, LABEL_USCIS_NUM);
      card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);
      
      card += String.format("║%-25s%-45S║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
      card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
      card += String.format("║%-25s%-15S%-30S║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
      card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, jdnToDate(birthday), sex);
      card += String.format("║%-25s%-15S%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, jdnToDate(validFromDate));
      card += String.format("║%-25s%-15S%-30s║%n", "", LABEL_EXPIRE_DATE, jdnToDate(expirationDate));
      card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
      card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
      return card;
    }
    	/**DESCRIPTION: Converts a Julian Day Number to Julian calendar date formatted as MM/DD/YYYY using algorithm adapted from https://en.wikipedia.org/wiki/Julian_day.*/
  public static String jdnToDate(int J)
	{
		int B, C, e, f, g, h, D, M, Y;
		
		B=274277;
		C=-38;
		f=J + 1401 + (((4*J+B)/146097)*3)/4+C;
		e=4*f+3;
		g=(e%1461)/4;
		h=5*g+2;
		D=((h%153)/5)+1;
		M=((h/153)+2)%12+1;
		Y=(e/1461)-4716+(12+2-M)/12;

		return String.format("%02d/%02d/%04d",M,D,Y);
	}
}
