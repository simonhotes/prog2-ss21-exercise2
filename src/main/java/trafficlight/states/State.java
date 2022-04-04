package trafficlight.states;

//DONE implement a part of the pattern here


public abstract class State extends Subject {
    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}