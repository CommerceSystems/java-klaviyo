/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum QueryParamFieldsTemplateUniversalContent {
    NAME("name"),
    DEFINITION("definition"),
    DEFINITION_CONTENT_TYPE("definition.content_type"),
    DEFINITION_TYPE("definition.type"),
    DEFINITION_DATA("definition.data"),
    DEFINITION_DATA_CONTENT("definition.data.content"),
    DEFINITION_DATA_DISPLAY_OPTIONS("definition.data.display_options"),
    DEFINITION_DATA_DISPLAY_OPTIONS_SHOW_ON("definition.data.display_options.show_on"),
    DEFINITION_DATA_DISPLAY_OPTIONS_VISIBLE_CHECK("definition.data.display_options.visible_check"),
    DEFINITION_DATA_DISPLAY_OPTIONS_CONTENT_REPEAT("definition.data.display_options.content_repeat"),
    DEFINITION_DATA_DISPLAY_OPTIONS_CONTENT_REPEAT_REPEAT_FOR("definition.data.display_options.content_repeat.repeat_for"),
    DEFINITION_DATA_DISPLAY_OPTIONS_CONTENT_REPEAT_ITEM_ALIAS("definition.data.display_options.content_repeat.item_alias"),
    DEFINITION_DATA_STYLES("definition.data.styles"),
    DEFINITION_DATA_STYLES_BLOCK_BACKGROUND_COLOR("definition.data.styles.block_background_color"),
    DEFINITION_DATA_STYLES_BLOCK_BORDER_COLOR("definition.data.styles.block_border_color"),
    DEFINITION_DATA_STYLES_BLOCK_BORDER_STYLE("definition.data.styles.block_border_style"),
    DEFINITION_DATA_STYLES_BLOCK_BORDER_WIDTH("definition.data.styles.block_border_width"),
    DEFINITION_DATA_STYLES_BLOCK_PADDING_BOTTOM("definition.data.styles.block_padding_bottom"),
    DEFINITION_DATA_STYLES_BLOCK_PADDING_LEFT("definition.data.styles.block_padding_left"),
    DEFINITION_DATA_STYLES_BLOCK_PADDING_RIGHT("definition.data.styles.block_padding_right"),
    DEFINITION_DATA_STYLES_BLOCK_PADDING_TOP("definition.data.styles.block_padding_top"),
    DEFINITION_DATA_STYLES_COLOR("definition.data.styles.color"),
    DEFINITION_DATA_STYLES_EXTRA_CSS_CLASS("definition.data.styles.extra_css_class"),
    DEFINITION_DATA_STYLES_FONT_FAMILY("definition.data.styles.font_family"),
    DEFINITION_DATA_STYLES_FONT_SIZE("definition.data.styles.font_size"),
    DEFINITION_DATA_STYLES_FONT_STYLE("definition.data.styles.font_style"),
    DEFINITION_DATA_STYLES_FONT_WEIGHT("definition.data.styles.font_weight"),
    DEFINITION_DATA_STYLES_INNER_PADDING_BOTTOM("definition.data.styles.inner_padding_bottom"),
    DEFINITION_DATA_STYLES_INNER_PADDING_LEFT("definition.data.styles.inner_padding_left"),
    DEFINITION_DATA_STYLES_INNER_PADDING_RIGHT("definition.data.styles.inner_padding_right"),
    DEFINITION_DATA_STYLES_INNER_PADDING_TOP("definition.data.styles.inner_padding_top"),
    DEFINITION_DATA_STYLES_MOBILE_STRETCH_CONTENT("definition.data.styles.mobile_stretch_content"),
    DEFINITION_DATA_STYLES_BACKGROUND_COLOR("definition.data.styles.background_color"),
    DEFINITION_DATA_STYLES_LETTER_SPACING("definition.data.styles.letter_spacing"),
    DEFINITION_DATA_STYLES_LINE_HEIGHT("definition.data.styles.line_height"),
    DEFINITION_DATA_STYLES_TEXT_ALIGN("definition.data.styles.text_align"),
    DEFINITION_DATA_STYLES_TEXT_DECORATION("definition.data.styles.text_decoration"),
    DEFINITION_DATA_STYLES_TEXT_TABLE_LAYOUT("definition.data.styles.text_table_layout"),
    CREATED("created"),
    UPDATED("updated"),
    SCREENSHOT_STATUS("screenshot_status"),
    SCREENSHOT_URL("screenshot_url");

    @JsonValue
    private final String value;

    private QueryParamFieldsTemplateUniversalContent(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
