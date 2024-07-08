package DesignPattern.SOLID.LSP.bad;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new PremiumMember("이세돌"),
            new FreeMember("이창호")
        );

        // FreeMember는 토너먼트를 주최할 수 없다
        // 즉, 조상클래스를 대체할 수 없다 -> LSP 위배
        for(Member member : members){
            member.organizeTournament();
        }
    }
}
