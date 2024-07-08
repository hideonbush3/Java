package DesignPattern.SOLID.LSP.good;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TournamentJoiner> members = Arrays.asList(
            new PremiumMember("이상혁"),
            new FreeMember("안기효")
        );

        // 각 회원 객체를 TournamentJoiner 인터페이스로
        // 대체했을때 정상작동 한다
        // 즉, LSP를 준수한다
        for(TournamentJoiner member : members){
            member.joinTournament();
        }

    }
}
