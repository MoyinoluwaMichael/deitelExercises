import javax.sound.midi.*;

public class Hymn {


    public static void main(String[] args) throws Exception {
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();

        Sequence sequence = new Sequence(Sequence.PPQ, 24);
        Track track = sequence.createTrack();

        // Set instrument to Acoustic Grand Piano (program 0)
        track.add(makeEvent(192, 1, 0, 0, 0));

        // Melody notes in MIDI numbers (simplified for C Major key, based on traditional tune)
        // Pattern for "I shall wear a golden crown" and similar lines
        int[] melodyPattern = {67, 69, 67, 64, 62, 64, 67}; // G4 A4 G4 E4 D4 E4 G4
        int[] durationPattern = {12, 12, 12, 12, 12, 12, 24}; // Mostly eighths, longer on last

        // Repeat pattern for the 4 pairs of lines in the verse
        int currentTick = 0;
        for (int repeat = 0; repeat < 4; repeat++) {
            for (int i = 0; i < melodyPattern.length; i++) {
                track.add(makeEvent(144, 1, melodyPattern[i], 100, currentTick)); // Note On
                int duration = durationPattern[i];
                track.add(makeEvent(128, 1, melodyPattern[i], 100, currentTick + duration)); // Note Off
                currentTick += duration;
            }
            // Short pause between phrases
            currentTick += 24;
        }

        sequencer.setSequence(sequence);
        sequencer.setTempoInBPM(120);
        sequencer.start();

        // Keep program running long enough to play the full instrumental
        Thread.sleep(20000); // About 20 seconds; adjust as needed
        sequencer.stop();
        sequencer.close();
    }

    private static MidiEvent makeEvent(int cmd, int chan, int note, int vel, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chan, note, vel);
            event = new MidiEvent(msg, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
