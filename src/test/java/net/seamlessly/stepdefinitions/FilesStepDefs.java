package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FilesPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;

public class FilesStepDefs {
    @When("the user clicks on an existing file's add to favorites under its own three dots menu")
    public void the_user_clicks_on_an_existing_file_s_add_to_favorites_under_its_own_three_dots_menu() {
    FilesPage filesPage = new FilesPage();
        filesPage.filesThreeDotMenu.click();
        filesPage.addToFavorites.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user navigates to favorites tab")
    public void the_user_navigates_to_favorites_tab() {
       new FilesPage().favoritesTab.click();
       BrowserUtils.waitFor(2);
    }

    @Then("the user can verify that the file has been added under the favorites tab")
    public void the_user_can_verify_that_the_file_has_been_added_under_the_favorites_tab() {
        System.out.println("favorited file name = " + new FilesPage().favoritedFile.getText());
        Assert.assertEquals("please do not edit or delete", new FilesPage().favoritedFile.getText());
    }

    @When("the user clicks on an existing file's rename under its own three dots menu")
    public void the_user_clicks_on_an_existing_file_s_rename_under_its_own_three_dots_menu() {
        FilesPage filesPage = new FilesPage();
        filesPage.filesThreeDotMenu.click();
        BrowserUtils.waitFor(2);
        filesPage.rename.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user renames the file")
    public void the_user_renames_the_file() {

     //   new FilesPage().renameBox.sendKeys("new name" + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("the user can verify that the file has been renamed")
    public void the_user_can_verify_that_the_file_has_been_renamed() {

    }

    @When("the user clicks on an existing file's details from its own three dots menu")
    public void the_user_clicks_on_an_existing_file_s_details_from_its_own_three_dots_menu() {

    }

    @When("the user navigates to comments tab")
    public void the_user_navigates_to_comments_tab() {

    }

    @When("put some comments")
    public void put_some_comments() {

    }

    @Then("the user can verify that comment has been added")
    public void the_user_can_verify_that_comment_has_been_added() {

    }

    @When("click on any comment's own three dot menu and select delete")
    public void click_on_any_comment_s_own_three_dot_menu_and_select_delete() {

    }

    @Then("the user can verify that comment has been deleted")
    public void the_user_can_verify_that_comment_has_been_deleted() {

    }

}
