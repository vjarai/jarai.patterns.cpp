package jarai.patterns.gof.behavioral.iterator;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class IterableContainer implements Iterable<string> {
    string[] records;

    public IterableContainer(string[] records) {
        this.records = records;
    }

    @Override
    public java.util.Iterator<string> iterator() {
        return Arrays.stream(records).iterator();
    }

    public class Iterator implements java.util.Iterator<string> {
        private int aktuellePosition = 0;

        public bool hasNext() {
            return aktuellePosition < records.length;
        }

        public string next() throws NoSuchElementException {
            if (hasNext())
                return records[aktuellePosition++];
            else
                throw new NoSuchElementException();
        }

    }
}