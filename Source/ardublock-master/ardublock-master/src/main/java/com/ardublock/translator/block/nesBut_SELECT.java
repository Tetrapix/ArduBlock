package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_SELECT extends TranslatorBlock
{
	public nesBut_SELECT(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_SELECT";
		return codePrefix + ret + codeSuffix;
	}
	
}
