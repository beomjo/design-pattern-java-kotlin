package k.bs.designpatternsp.behavioral.command.ja;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        Button button1 = new Button(lampOnCommand); // 램프 켜는 Command 설정
        button1.pressed(); // 램프 켜는 기능 수행

        Button button2 = new Button(alarmStartCommand); // 알람 울리는 Command 설정
        button2.pressed(); // 알람 울리는 기능 수행
        button2.setCommand(lampOnCommand); // 다시 램프 켜는 Command로 설정
        button2.pressed(); // 램프 켜는 기능 수행
    }
}
