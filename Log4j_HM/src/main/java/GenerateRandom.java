import org.apache.log4j.Logger;

import java.util.Random;

public class GenerateRandom {
    private final Random random = new Random();

    private static final Logger logger = Logger.getLogger(GenerateRandom.class);

    public int generateNumber() {
        int randomNumber = random.nextInt(11);
        if (randomNumber <= 5) {
            try {
                throw new OneException("Сгенерированное число - " + randomNumber);
            } catch (OneException ex) {
                logger.error(ex);
            }
        } else {
            logger.info("Приложение успешно запущено");

        }
        return randomNumber;

    }
}

