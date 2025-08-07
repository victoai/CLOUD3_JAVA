package 일정관리;

import java.util.ArrayList;

public class Admin extends User {

    public Admin(String name, String id, String password) {
        super(name, id, password);
    }

    @Override
    public boolean isAdmin() {
        return true;
    }

    // 관리자 전용 일정 삭제 기능
    public void deleteAnySchedule(ArrayList<Manage> schedules, int index) {
        if (index >= 0 && index < schedules.size()) {
            schedules.remove(index);
            System.out.println("관리자 권한으로 일정이 삭제되었습니다.");
        } else {
            System.out.println("잘못된 접근입니다.");
        }
    }
}
