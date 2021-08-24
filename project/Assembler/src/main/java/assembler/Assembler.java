package assembler;


import businessLogic.BusinessLogic;
import businessLogic.BusinessLogicImplementationProvider;
import gui.GUIApp;
import persistence.PersistenceAPI;
import persistence.PersistenceImplementationProvider;





public class Assembler{
 public static void main(String[] args) {
     PersistenceAPI persistenceAPI = PersistenceImplementationProvider.getImplementation();
     BusinessLogic businessLogic  = BusinessLogicImplementationProvider.getImplementation(persistenceAPI);
     new GUIApp(businessLogic).show();
 }

}
