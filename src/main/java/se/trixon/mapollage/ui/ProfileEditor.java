/*
 * Copyright 2018 Patrik Karlström.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.trixon.mapollage.ui;

import java.util.ArrayList;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Region;
import org.controlsfx.validation.ValidationResult;
import org.controlsfx.validation.ValidationSupport;
import se.trixon.mapollage.profile.Profile;
import se.trixon.mapollage.ui.config.BaseTab;
import se.trixon.mapollage.ui.config.DescriptionTab;
import se.trixon.mapollage.ui.config.FoldersTab;
import se.trixon.mapollage.ui.config.PathTab;
import se.trixon.mapollage.ui.config.PhotoTab;
import se.trixon.mapollage.ui.config.PlacemarkTab;
import se.trixon.mapollage.ui.config.SourceTab;

/**
 *
 * @author Patrik Karlström
 */
public class ProfileEditor extends TabPane {

    private FoldersTab mFoldersTab;
    private Button mOkButton;
    private PathTab mPathTab;
    private PhotoTab mPhotoTab;
    private PlacemarkTab mPlacemarkTab;
    private Profile mProfile;
    private SourceTab mSourceTab;
    private DescriptionTab mDescriptionTab;
    private final ArrayList<BaseTab> mTabs = new ArrayList<>();
    private final ValidationSupport mValidationSupport = new ValidationSupport();

    public ProfileEditor() {
        createUI();
    }

    public ProfileEditor(Tab... tabs) {
        super(tabs);
        createUI();
    }

    public ProfileEditor(Profile profile) {
        mProfile = profile;
        createUI();
    }

    public void save() {
        mTabs.forEach((tab) -> {
            tab.save();
        });
    }

    private void createUI() {
        final double TAB_SIZE = BaseTab.ICON_SIZE * 1.5;
        setTabMaxHeight(TAB_SIZE);
        setTabMinHeight(TAB_SIZE);
        setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        BaseTab.setValidationSupport(mValidationSupport);

        mSourceTab = new SourceTab(mProfile);
        mFoldersTab = new FoldersTab(mProfile);
        mPathTab = new PathTab(mProfile);
        mPlacemarkTab = new PlacemarkTab(mProfile);
        mDescriptionTab = new DescriptionTab(mProfile);
        mPhotoTab = new PhotoTab(mProfile);

        final ObservableList<Tab> tabs = getTabs();
        tabs.add(mSourceTab);
        tabs.add(mFoldersTab);
        tabs.add(mPathTab);
        tabs.add(mPlacemarkTab);
        tabs.add(mDescriptionTab);
        tabs.add(mPhotoTab);

        tabs.forEach((tab) -> {
            mTabs.add((BaseTab) tab);
        });

        final int size = 8;
        Insets insets = new Insets(size, size, size, size);
        mTabs.forEach((tab) -> {
            try {
                Region r = (Region) tab.getContent();
                r.setPadding(insets);

            } catch (Exception e) {
            }
        });

        mValidationSupport.validationResultProperty().addListener((ObservableValue<? extends ValidationResult> observable, ValidationResult oldValue, ValidationResult newValue) -> {
            mOkButton.setDisable(mValidationSupport.isInvalid());
        });

        mValidationSupport.initInitialDecoration();
    }

    void setOkButton(Button button) {
        mOkButton = button;
    }
}
