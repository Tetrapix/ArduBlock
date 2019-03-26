package com.ardublock.translator.block.adafruit;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class Neopixel_pixel_colorRGB  extends TranslatorBlock {

	public Neopixel_pixel_colorRGB (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{
			//String Pin ;
			String Pixel_Nb;
			String Red;
			String Blue;
			String Green;
			//TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			//Pin = translatorBlock.toCode();
			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			Pixel_Nb = translatorBlock.toCode();
			translatorBlock = this.getRequiredTranslatorBlockAtSocket(1);
			Red = translatorBlock.toCode();
			translatorBlock = this.getRequiredTranslatorBlockAtSocket(2);
			Green = translatorBlock.toCode();
			translatorBlock = this.getRequiredTranslatorBlockAtSocket(3);
			Blue = translatorBlock.toCode();
			
		
			
			String ret = "strip.setPixelColor("+Pixel_Nb+","+Green+" ,"+Red+" ,"+Blue+" );\n"
					+ "strip.show();\n";
			
			return codePrefix + ret + codeSuffix;
				
		}
}
