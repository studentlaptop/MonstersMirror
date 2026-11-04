package io.studentlaptop.monsters.monster.move;

public class MoveSetTests {
    @Test
    public void constructMoveSetWithBuilder() {
        MoveSet builderMoveSet = new MoveSet(new Builder(MoveInfo.DOUBLE_KICK).secondMove(MoveInfo.SLAM));

        assertSame(MoveInfo.DOUBLE_KICK, builderMoveSet.getFirstMove().getInfo());
        assertSame(MoveInfo.SLAM, builderMoveSet.getSecondMove().getInfo());

        assertNull(builderMoveSet.getThirdMove());
        assertNull(builderMoveSet.getFourthMove());

        assertEquals(4, builderMoveSet.size());
    }
}
