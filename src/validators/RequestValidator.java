package validators;

public class RequestValidator {

    public void validateGetRequest() {
        OrderValidator orderValidator = new OrderValidator();
        orderValidator.validateTypeOfPlanks();
        orderValidator.validateNumberOfPlanks();
        PlankValidator plankValidator = new PlankValidator();
        plankValidator.validateSizesOfPlanks();
        plankValidator.validateQualityOfPlanks();
    }
}
