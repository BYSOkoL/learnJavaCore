package dmitry.sokolov.classwork.Task2PC;

public class PC {
   private String processor;
   private Integer ramSize;
   private Integer hddSize;
   private Integer displayCount;

    public PC(String processor, Integer RAMSize, Integer HDDSize, Integer displayCount) {
        this.processor = processor;
        this.ramSize = RAMSize;
        this.hddSize = HDDSize;
        this.displayCount = displayCount;
    }
    public void print () {
        System.out.printf("Processor: %s, RAM Size: %s, HDD Size: %s, DisplayCount: %s \n",
                processor,
                ramSize,
                hddSize,
                displayCount);
    }

    public Integer getHddSize() {
        return hddSize;
    }
}
