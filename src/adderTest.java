import static org.junit.jupiter.api.Assertions.*;

class adderTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        // 前置動作寫這裡
        // 例如跟資料連線的作業
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        // 離開時要做的
        // 例如資料庫登出，清除連線作業等
    }

    @org.junit.jupiter.api.Test
    void add() {
        adder cal = new adder();
        int actual = cal.add(1, 2);
        assertEquals(3, actual); // 順序可調，只是看兩者是否相同
        assertEquals(25, cal.add(12, 13));
        assertEquals(0, cal.add(0, 0), "99+(-99)");
    }
}