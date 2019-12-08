package pl.sda.cucumber;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.sda.cucumber.HelloWorld;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs {
    HelloWorld helloWorld;
    String zwroconePowitanie = "";

    @Given("Srworzona instalacja klasy obiektu HelloWord")
    public void srworzonaInstalacjaKlasyObiektuHelloWord() {
        helloWorld = new HelloWorld();
    }

    @When("Wprowdzono jęnzyk {string}")
    public void wprowdzonoJęnzykPolskij(String lang) {
        zwroconePowitanie =helloWorld.getHelloMessage(lang);
    }

    @Then("Wyświetlony zostal komunikat {string}")
    public void wyświetlonyZostalKomunikatWJęzykuPolskim(String powitanie) {
        assertThat(zwroconePowitanie).isEqualTo(powitanie);
    }

    }
