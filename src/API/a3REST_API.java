package API;

public class a3REST_API {

	public static void main(String[] args) {
		
		// https://reqres.in/ use for REST API prectice 

	}}
/* Applications interacting with each other base on CRUD.
 * 
 * C - Create ==> POST
 * R - Retrieve ==>GET
 * U - UPdtae ==> PUT
 * D - Delete ==> Delete.
 * 
 *  when application send request to application B base on HHTP request consider URI, Headers, Payload. Payload can be anything XML, JASON..
 *  
 *  After request App B will resond  base on HTTP respond , Status 200 Ok, Respond payload, String masg - succses 
 *  
 *  1- POST:when ever we create a new intitiy or create an account in application we use POST , we call POST, there will be an orical database where we can send the information
 *  and then database have connected with app B and app B will respon app A base on request.
 *  
 *  2-  Get, when ever we fetch any data from database we use GET method , GET methid doest need for any payload we passe URi and somethe information, paty parater and sowm quary paramet. header avaliabe'
 *  
 *  URI is the combination of URL and path parameter/quarry parameter. URL(End point URL) +Services URL = URI
 *  
 *  3- Update - PUT : combination of Create (POST) and Update (PUT). after edist existing account or information we will check does the information change or not. 
 *  PUT use for creating account or entity and also update the use of accubt  
 *  
 *   4- Delete: an account JAMSON >> account =1 Account =100 , Account name " Tom, address, account type... and will delete the account with infromation.
 *   
 *   above all methods are using for REST APIs
 *   
 *   
 *   Responds status:
 *   
 *   200 OK, 201, Created, 400, bad request, 404 not found, 500 internal error,  kblcustomer@thy.com.
 *   
 *   Query parameter define by ? to filter the the result  ==> https://requests.in/api/users?page=2 ==> page is quarry parameter and 2 is the QP value. (https://requests.in) ==> in point URL and (api/users?page=2) ==> API URL == URI
 *   developers always providing end point URLs. 
 *   
 *   path parameter define by / for specific information  ==> https://requests.in/api/users/2
 *   
 */

