package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_DOWN extends TranslatorBlock
{
	public nesBut_DOWN(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_DOWN";
		return codePrefix + ret + codeSuffix;
	}
	
}
