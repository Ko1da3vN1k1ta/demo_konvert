package converter;

public class Currency  {


    private void convert() {
        double rubles = Double.parseDouble(rubleField.getText());
        String selectedCurrency = (String) currencyField.getSelectedItem();
        double result = rubles / currentExchangeRate;
        currencyFinalField.setText("Результат: " + String.format("%.2f", result) + " " + selectedCurrency);
        currentExchangeRate = getRandomExchangeRate();
    }

    private double getRandomExchangeRate() {
        return 0.1 + Math.random() * 2.9;
    }

}