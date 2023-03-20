public class RandomGenerator {
    public int generateInt(Integer min, Integer max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}