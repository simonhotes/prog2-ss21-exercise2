import trafficlight.ctrl.TrafficLightCtrl;

// https://github.com/simonhotes/prog2-ss21-exercise2.git

public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();
    }
}