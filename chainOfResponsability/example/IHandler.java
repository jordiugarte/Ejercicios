package chainOfResponsability.example;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(int amount);   // nuestra peticion

}