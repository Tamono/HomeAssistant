package core;

public abstract class Addon {

    public final String name;
    public final String[] hotWords;

    public Addon(final String name, final String[] hotWords) {
        this.name = name;
        this.hotWords = hotWords;
    }

    /**
     * Take steps to initialize the addon. This is done only once after the addon has been added.
     */
    public abstract void init();

    /**
     * Start the main functionality of the addon
     * @param userInput - The input from the user for parsing
     */
    public abstract void run(String userInput);

    /**
     * Change the current run of the Addon with the given addons
     * @param userInput - The input from the user for parsing
     */
    public abstract void change(String userInput);

    /**
     * Stop the run of the Addon and return to the main Loop
     */
    public abstract void stop();

    // ################### INFORMATION ###################
    public abstract boolean isRunning();

    // ################### PROTECTED ###################

    /**
     *
     * @param content
     */
    protected void output(final String content) { IO.out(content); }
}
