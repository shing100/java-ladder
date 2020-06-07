package ladder.domain.ladder;

import java.util.List;

public class Ladder {

    private final List<Line> lineList;

    private Ladder(final List<Line> lineList){
        this.lineList = lineList;
    }

    public static Ladder create(final List<Line> lineList) {
        return new Ladder(lineList);
    }

}
